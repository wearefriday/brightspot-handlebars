package com.project;

import java.util.List;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.Renderer;
import com.psddev.cms.db.ToolUi;
import com.psddev.dari.db.ReferentialText;

@Renderer.Path("article.hbs")
public class Article extends Content {

    @Required
    @Indexed
    private String headline;
    @ToolUi.Note("Body of text for the article")
    private ReferentialText bodyText;
    private List<String> keywords;

    // Getters and Setters

    public String getHeadline() {
       return headline;
    }

    public ReferentialText getBodyText() {
       return bodyText;
    }

}
