package hbs;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.Renderer;

@Renderer.Path("hbs/test.hbs")
public class HandlebarsRendererTestClass extends Content {

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
