# libgdx-wiki-on-pages

This project is made to replicate Github Wikis using Github Pages.
The Github Wiki is not getting indexed by search engines. [See discussion](https://github.com/isaacs/github/issues/1683)

[Click this link to see resulting Website in browser](https://spaio.github.io/libgdx-wiki-on-pages/wiki/)

It is planned to included multiple repository Wikis into this one.
- Libgdx Wiki (possibly would be merged into Libgdx website)
- Raeleus Wiki (if author accepts)
- MrStahlfelge Wiki (if author accepts)

Also planned:
- Pages index/search support
- Correct replacements for any original links like clone repository, edit, new page and other


The code uses [Primer/css](https://github.com/primer/css) library. This is native style for Github.
At the moment, SCSS comes from unpkg.com because i dont have time to fully implement Primer from sources. It requires npm, ruby gems, may be any else technology i have no experience with.
Html template structure and few Wiki-specific css things taken straight from GitHub Wiki page sources.

To run the project locally, you need to install Jekyll and its dependencies. Probably by combining these 2 guides you will have success:
- [Official Jekyll installation guide](https://jekyllrb.com/docs/installation/)
- [Github Jekyll installation guide](https://docs.github.com/en/pages/setting-up-a-github-pages-site-with-jekyll/testing-your-github-pages-site-locally-with-jekyll)

