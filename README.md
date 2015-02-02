# BrightSpot + Handlebars POC

Drop in [Handlebars.java](https://github.com/jknack/handlebars.java) Renderer for
[BrightSpot](http://www.brightspotcms.com/) content

## Dependencies

* Maven 3+
* Java 1.7

## Installation

Clone this repo

## Usage

Run `mvn clean package cargo:run`

Naviate to [http://localhost:8080/this](http://localhost:8080/this) to see the results.

It pulls the `mainContent` attribute out of the request and renders fields from it in a Handlebars template:

    Something Really Exciting
    This is <b>even</b> better


## Content Classes

To make the content attributes visible to Handlebars you need to provide getters in your content class e.g.

    private String headline;

    public String getHeadline() {
       return headline;
    }

## Content Editing

To see the content navigate to it in the [cms admin interface](http://localhost:8080/cms/content/edit.jsp?id=0000014b-131d-de07-a9cf-3bffcbf70000)

Login for the cms with username/password: **admin/admin**.

## Next Steps

* Test with images
* Test with partials
* Load template from file system
* Use helpers