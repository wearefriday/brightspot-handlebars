package org.fridayengineering.handlebars;

import com.psddev.cms.db.Renderer;

@Renderer.Path("org/fridayengineering/handlebars/handlebarsTestTemplate.hbs")
public class SimpleDomainClass {

    private String fieldA;
    private String fieldB;

    public String getFieldA() {
	return fieldA;
    }

    public void setFieldA(String fieldA) {
	this.fieldA = fieldA;
    }

    public String getFieldB() {
	return fieldB;
    }

    public void setFieldB(String fieldB) {
	this.fieldB = fieldB;
    }

}
