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

It pulls the `mainContent` attribute out of the request and renders it *as is* in a Handlebars template:

    Got:{database=com.psddev.cms.db.VaryingDatabase@50a657a5(delegate=com.psddev.dari.db.CachingDatabase@6bcae731(delegate=handlebarsTest.local(handlebarsTest.local/delegate/sql, handlebarsTest.local/delegate/solr))), status=SAVED, id=0000014b-131d-de07-a9cf-3bffcbf70000, typeId=0000014a-ebce-d9d8-a7df-ebdf1b1f0000, simpleValues={cms.content.publishDate=1421954906230, cms.content.publishUser={_ref=0000014a-ebc9-ddff-a1da-efed392a0000,_type=0000014a-ebc8-ddff-a1da-efecb7a90013}, cms.content.updateDate=1422297004315, cms.content.updateUser={_ref=0000014a-ebc9-ddff-a1da-efed392a0000,_type=0000014a-ebc8-ddff-a1da-efecb7a90013}, cms.ab.fields={}, headline=Something Really Exciting, bodyText=[This is&nbsp;<b>even</b> better], keywords=[], cms.seo.keywords=[], cms.seo.robots=[], cms.directory.paths=[0000014b-132b-de07-a9cf-3bff9a3c0000/this], cms.directory.pathTypes={0000014b-132b-de07-a9cf-3bff9a3c0000/this=PERMALINK}, cms.directory.pathsMode=MANUAL, _id=0000014b-131d-de07-a9cf-3bffcbf70000, _type=0000014a-ebce-d9d8-a7df-ebdf1b1f0000}, extras={dari.creatorDatabase=handlebarsTest.local/delegate/sql,dari.creatorQuery={group=null, objectClass=null, predicate=cms.directory.paths equalsany '0000014b-132b-de07-a9cf-3bff9a3c0000/this', sorters=[], database=com.psddev.cms.db.VaryingDatabase@50a657a5(delegate=com.psddev.dari.db.CachingDatabase@6bcae731(delegate=handlebarsTest.local(handlebarsTest.local/delegate/sql, handlebarsTest.local/delegate/solr))), isResolveToReferenceOnly=false, timeout=null, options={}},cms.variation.applied=[]}, errors=null}

Next step is to get the template to pull the content attributes, e.g. *headline*, *bodyText* out individually.

## Content

To see the content navigate to it in the [cms admin interface](http://localhost:8080/cms/content/edit.jsp?id=0000014b-131d-de07-a9cf-3bffcbf70000)

Login for the cms with username/password: **admin/admin**.

