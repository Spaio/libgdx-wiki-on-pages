{% raw %}
When rendering many [Models]] using [ModelBatch](modelbatch) you might notice that it will have an impact on performance. This is often because every [[part](models#nodepart) of the model will cause a [render call](https://github.com/libgdx/libgdx/wiki/modelbatch#what-are-render-calls). Every render call requires the GPU and the CPU to synchronize, which is a relatively costly operation. Therefor you typically want to keep the number of render calls to a minimum.

There are multiple ways to reduce the number of render calls. For example by *frustum culling* (not rendering what wont be visible anyway), by *optimizing your models* to contain less parts or by *merging models* to reduce the number of models. [ModelCache](https://libgdx.badlogicgames.com/nightlies/docs/api/com/badlogic/gdx/graphics/g3d/ModelCache.html) ([code](https://github.com/libgdx/libgdx/blob/master/gdx/src/com/badlogic/gdx/graphics/g3d/ModelCache.java)) allows to do the latter two of those at runtime.

> **BE AWARE** merging and optimizing models *at runtime* is typically still a relatively costly operation and when done incorrectly it can even make performance worse. Always make sure to implement other options of reducing the render calls, like frustum culling or optimizing assets, as well.

ModelCache is somewhat comparable to [SpriteCache](https://libgdx.badlogicgames.com/nightlies/docs/api/com/badlogic/gdx/graphics/g2d/SpriteCache.html) and [SpriteBatch](spritebatch,-textureregions,-and-sprites) which are used for 2D rendering. However, models typically are more complex compared to sprites in for example the number of vertices, vertex attributes and the material.

ModelCache will not merge skinned meshes. When you add a skinned mesh it will not be merged, but instead kept as is. So it is safe to add a skinned mesh to the cache, but it won't reduce the number of render calls (because skinning is applied inside the render call).

## Using ModelCache

Using ModelCache is similar to using [ModelBatch]]. To start merging and optimizing models you'll have to call the `begin()` method. Then you can `add()` one or more [ModelInstance](https://libgdx.badlogicgames.com/nightlies/docs/api/com/badlogic/gdx/graphics/g3d/ModelInstance.html)s or other [[RenderableProvider](modelbatch#renderableprovider)s. After that call the `end()` method to actually perform the merging.

When the cache is created (after the call to `end()`) you can use it in the call to `ModelBatch.render`.

ModelCache owns several native resources. Therefor you should `dispose()` the cache when no longer needed.

```java
ModelBatch batch;
ModelCache cache;
public void create() {
    //...
    Array<ModelInstance> instances = createTheInstanceYouWantToMerge();
    cache = new ModelCache();
    cache.begin();
    cache.add(instances);
    cache.end();
    //... create the batch and such
}
public void render() {
    //... call glClear and such
    batch.begin();
    batch.render(cache, environment);
    batch.end();
}
public void dispose() {
    // dispose models and such
    cache.dispose();
    batch.dispose();
}
```

It is possible to use ModelCache for dynamic models, for example objects that move every frame. In that case you can recreate the cache on every render call.

```java
ModelBatch batch;
ModelCache cache;
Array<ModelInstance> instances;
public void create() {
    //...
    instances = createTheInstanceYouWantToMerge();
    cache = new ModelCache();
    //... create the batch and such
}
public void render() {
    //... call glClear and such
    cache.begin();
    cache.add(instances);
    cache.end();

    batch.begin();
    batch.render(cache, environment);
    batch.end();
}
public void dispose() {
    // dispose models and such
    cache.dispose();
    batch.dispose();
}
```
{% endraw %}