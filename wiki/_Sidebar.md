# Table of Contents
[[Wiki Style Guide|Wiki-Style-Guide]]

## Getting Started
* [Setting Up a Dev Environment](https://libgdx.com/dev/setup/)
* [Creating Your First libGDX Project](https://libgdx.com/dev/project_generation/)
* [Importing & Running It](https://libgdx.com/dev/import_and_running/)
* [A Simple Game](https://libgdx.com/dev/simple_game/)
* [Extending the Simple Game](https://libgdx.com/dev/simple_game_extended/)

## Developer's Guide
<details><summary>The Application Framework</summary>

* [[The Application Framework|The-Application-Framework]]  
* [[The Life-Cycle|The-Life-Cycle]]  
* [[Modules Overview|Modules-Overview]]  
* [[Starter Classes and Configuration|Starter-Classes-and-Configuration]]  
* [[Querying|Querying]]  
* [[Logging|Logging]]  
* [[Threading|Threading]]  
* [[Interfacing With Platform-Specific Code|Interfacing-With-Platform-Specific-Code]]

</details>

[[File Handling|File-Handling]]

[[Networking|Networking]]

[[Preferences|Preferences]]

<details><summary>Input Handling</summary>

* [[Input Handling|Input-Handling]]
* [[Configuration and Querying|Configuration-and-Querying]]
* [[Mouse, Touch and Keyboard|Mouse,-Touch-and-Keyboard]]
  * [[Polling|Polling]]  
  * [[Event Handling|Event-Handling]]
* [[Controllers|Controllers]]
* [[Gesture Detection|Gesture-Detection]]
* [[Simple Text Input|Simple-Text-Input]]
* [[Accelerometer|Accelerometer]]
* [[Compass|Compass]]
* [[Gyroscope|Gyroscope]]
* [[Vibrator|Vibrator]]
* [[Cursor Visibility and Catching|Cursor-Visibility-and-Catching]]
* [[Back and Menu Key Catching|Back-and-Menu-Key-Catching]]
* [[On-Screen Keyboard|On-Screen-Keyboard]]
* [[Adding new Keycodes|Adding-new-Keycodes]]

</details>

[[Memory Management|Memory-Management]]

<details><summary>Audio</summary>

* [[Audio|Audio]]
* [[Sound Effects|Sound-Effects]]
* [[Streaming Music|Streaming-Music]]
* [[Playing PCM Audio|Playing-PCM-Audio]]
* [[Recording PCM Audio|Recording-PCM-Audio]]

</details>

<details><summary>Graphics</summary>

* [[Graphics|Graphics]]
* [[Querying and configuring graphics (monitors, display modes, vsync, display cutouts)|Querying-and-configuring-graphics-(monitors,-display-modes,-vsync,-display-cutouts)]]
* [[Continuous and Non-Continuous Rendering|Continuous-and-Non-Continuous-Rendering]]
* [[Clearing the Screen|Clearing-the-Screen]]
* [[Taking a Screenshot|Taking-a-Screenshot]]
* [[Profiling|Profiling]]
* [[Viewports|Viewports]]
* [[OpenGL (ES) Support|OpenGL-(ES)-Support]]  
  * Configuration and Querying OpenGL ??  
  * Direct Access ??  
  * Utility Classes  
     -[[Rendering Shapes|Rendering-Shapes]]  
     -[[Textures and TextureRegions|Textures-and-TextureRegions]]  
     -[[Meshes|Meshes]]  
     -[[Shaders|Shaders]]  
     -[[Frame Buffer Objects|Frame-Buffer-Objects]]

&nbsp;&nbsp;&nbsp; **2D Graphics**  
* [[SpriteBatch, TextureRegions, and Sprites|SpriteBatch,-TextureRegions,-and-Sprites]]  
* [[2D Animation|2D-Animation]]  
* [[Clipping, With the Use of ScissorStack|Clipping,-With-the-Use-of-ScissorStack]]  
* [[Masking|Masking]]  
* [[Orthographic Camera|Orthographic-Camera]]  
* Mapping Touch Coordinates ??  
* [[NinePatches|NinePatches]]  
* [[Bitmap Fonts|Bitmap-Fonts]]  
  * [[Distance Field Fonts|Distance-Field-Fonts]]  
  * [[Color Markup Language|Color-Markup-Language]]  
* [[Using TextureAtlases|Using-TextureAtlases]]  
* [[Pixmaps|Pixmaps]]  
* [[Packing Atlases Offline|Packing-Atlases-Offline]]  
* [[Packing Atlases at Runtime|Packing-Atlases-at-Runtime]]  
* [[Texture Compression|Texture-Compression]]  
* [[2D ParticleEffects|2D-ParticleEffects]]  
* [[Tile Maps|Tile-Maps]]  
* [[scene2d|scene2d]]  
* [[scene2d.ui|scene2d.ui]]  
  * [[Table|Table]]  
  * [[Skin|Skin]]  
* [[ImGui|ImGui]]

&nbsp;&nbsp;&nbsp; **[[3D Graphics|3D-Graphics]]**

* [[Quick Start|Quick-Start]]  
* [[Models|Models]]  
* [[Material and Environment|Material-and-Environment]]  
* [[ModelBatch|ModelBatch]]  
* [[ModelCache|ModelCache]]  
* [[ModelBuilder, MeshBuilder and MeshPartBuilder|ModelBuilder,-MeshBuilder-and-MeshPartBuilder]]  
* [[3D Animations and Skinning|3D-Animations-and-Skinning]]  
* [[Importing Blender Models in libGDX|Importing-Blender-Models-in-libGDX]]  
* [[3D Particle Effects|3D-Particle-Effects]]  
* [[Virtual Reality (VR)|Virtual-Reality-(VR)]]
* [[3D Picking|3D-Picking]]
* Perspective Camera ??  

</details>

[[Managing Your Assets|Managing-Your-Assets]]

[[HTML5 Backend and GWT Specifics|HTML5-Backend-and-GWT-Specifics]]

[[Internationalization and Localization|Internationalization-and-Localization]]

<details><summary>Utilities</summary>

* [[Reading and Writing JSON|Reading-and-Writing-JSON]]
* [[Reading and Writing XML|Reading-and-Writing-XML]]
* [[Collections|Collections]]
* [[Reflection|Reflection]]
* [[jnigen|jnigen]]

</details>

<details><summary>Math Utilities</summary>

* [[Math Utilities|Math-Utilities]]
* [[Interpolation|Interpolation]]
* [[Vectors, Matrices, Quaternions|Vectors,-Matrices,-Quaternions]]
* [[Circles, Planes, Rays, etc.|Circles,-Planes,-Rays,-etc.]]
* [[Path Interface and Splines|Path-Interface-and-Splines]]
* Bounding Volumes ??
* Intersection and Overlap Testing ??

</details>

<details><summary>Tools</summary>

* [[Texture Packer|Texture-Packer]]
* [[Hiero|Hiero]]
* [[2D Particle Editor|2D-Particle-Editor]]
* [[Skin Composer|Skin-Composer]]
* [[Overlap2D|Overlap2D]]

</details>

<details><summary>Extensions</summary>

* [[Artificial Intelligence|Artificial-Intelligence]]
* [[gdx-freetype|gdx-freetype]]
* [[gdx-pay|gdx-pay]]: cross-platform In-App-Purchasing API
* [[Physics|Physics]]  
  * [[Box2D|Box2D]]  
  * [[Bullet Physics|Bullet-Physics]]  
     -[[Setup|Bullet Wrapper Setup]]  
     -[[Using the Wrapper|Bullet Wrapper Using the wrapper]]  
     -[[Using Models|Bullet Wrapper Using models]]  
     -[[Contact Callbacks|Bullet Wrapper Contact callbacks]]  
     -[[Custom Classes|Bullet Wrapper Custom classes]]  
     -[[Debugging|Bullet Wrapper Debugging]]
* [[Publishing Your Own Extensions|Third Party Extension Support]]
</details>

<details><summary>Using libGDX With Other JVM Languages</summary>

* [[Using libGDX With Other JVM Languages|Using-libGDX-With-Other-JVM-Languages]]
* [[Using libGDX With Clojure|Using-libGDX-With-Clojure]]
* [[Using libGDX With Kotlin|Using-libGDX-With-Kotlin]]
* [[Using libGDX With Python|Using-libGDX-With-Python]]
* [[Using libGDX With Scala|Using-libGDX-With-Scala]]

</details>

<details><summary>Third Party Services</summary>

* [[AdMob in libGDX|AdMob-in-libGDX]]
* [[Airpush in libGDX|Airpush-in-libGDX]]
* [[Firebase in libGDX|Firebase-in-libGDX]]
* [[Smaato in libGDX|Smaato-in-libGDX]]
* [[Google Play Games Services in libGDX|Google-Play-Games-Services-in-libGDX]]
* [[Pollfish in libGDX|Pollfish-in-libGDX]]
* [[ProGuard/DexGuard and libGDX|ProGuard/DexGuard-and-libGDX]]

</details>

## Articles
* [[Getting Help|Getting-Help]]
* [[External Tutorials|External-Tutorials]]
* [[Java Development Kit - Selection|Java-Development-Kit---Selection]]
* [[Deploying your application|Deploying-your-application]]
* [[Coordinate systems|Coordinate-systems]]
* [[Updating Your libGDX Version|Updating libGDX]]
* [[Adding Extensions and 3rd Party Libraries|Dependency management with Gradle]]
* [[Improving Your Gradle Workflow|Improving-workflow-with-Gradle]]
* [[Creating Asset Project in Eclipse|Creating-a-Separate-Assets-Project-in-Eclipse]]