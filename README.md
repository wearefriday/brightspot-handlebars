# BrightSpot + Handlebars POC

Drop in [Handlebars.java](https://github.com/jknack/handlebars.java) Renderer for
[BrightSpot](http://www.brightspotcms.com/) content

## Dependencies

* Maven 2
* Java 1.7

## Installation

Clone this repo

## Usage

Run `mvn clean package cargo:run`

Naviate to [http://localhost:8080/this](http://localhost:8080/this) to see the results.

To see the content navigate to it in the [cms admin interface](http://localhost:8080/cms/content/edit.jsp?id=0000014b-131d-de07-a9cf-3bffcbf70000)

Login for the cms with username/password: **admin/admin**.

Right know all you get is some hard coded text presented by an inline Handlebars template.

So all you see is:

    Hello Brightspot!

Working on how to get the attributes of the Content for which the Renderer has been called
so we can pass these to the template.
