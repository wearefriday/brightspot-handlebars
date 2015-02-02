package com.project;

import java.util.List;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.Renderer;
import com.psddev.cms.db.ToolUi;
import com.psddev.dari.db.ReferentialText;
import com.psddev.dari.util.StorageItem;

@Renderer.Path("article.hbs")
public class Article extends Content {

    @Required
    @Indexed
    private String headline;
    @ToolUi.Note("Body of text for the article")
    private ReferentialText bodyText;
    private List<String> keywords;
    private StorageItem photo;

    // Getters and Setters

    public String getHeadline() {
       return headline;
    }

    public ReferentialText getBodyText() {
       return bodyText;
    }

    public List<String> getKeywords() {
	return keywords;
    }

    public void setKeywords(List<String> keywords) {
	this.keywords = keywords;
    }

    public StorageItem getPhoto() {
	return photo;
    }

    public void setPhoto(StorageItem photo) {
	this.photo = photo;
    }

    public void setHeadline(String headline) {
	this.headline = headline;
    }

    public void setBodyText(ReferentialText bodyText) {
	this.bodyText = bodyText;
    }

}
