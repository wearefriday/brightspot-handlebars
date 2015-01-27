package com.project;

import com.psddev.dari.db.*;
import com.psddev.dari.util.*;
import com.psddev.cms.db.*;
import java.util.*;

@Renderer.Path("/templates/example.hbs")
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
