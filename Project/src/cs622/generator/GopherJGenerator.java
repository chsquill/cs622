package cs622.generator;

import javax.lang.model.element.Modifier;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import cs622.field.Component;

public class GopherJGenerator {

	/**
	 * Builds a Java class file from the provided components.
	 */
	public void generate(Component[] components) {

		// generate class
		TypeSpec.Builder classBuilder = TypeSpec.classBuilder("GopherJDto").addModifiers(Modifier.PUBLIC)
				.addJavadoc("GopherJDto - This class was auto generated.");

		// generate fields
		for (Component component : components) {
			classBuilder
					.addField(FieldSpec.builder(component.getType(), component.getName(), Modifier.PRIVATE).build());
		}

		// generate methods
		for (Component component : components) {
			MethodSpec getMethod = MethodSpec.methodBuilder("get" + generateAccessorName(component.getName()))
					.addStatement(String.format("return %s", component.getName())).addModifiers(Modifier.PUBLIC)
					.returns(component.getType()).build();
			classBuilder.addMethod(getMethod);

			MethodSpec setMethod = MethodSpec.methodBuilder("set" + generateAccessorName(component.getName()))
					.addStatement(String.format("this.%s = %s", component.getName(), component.getName()))
					.addModifiers(Modifier.PUBLIC).addParameter(component.getType(), component.getName()).build();
			classBuilder.addMethod(setMethod);
		}

		TypeSpec tyepSpec = classBuilder.build();

		JavaFile javaFile = JavaFile.builder("gopherj", tyepSpec).build();

		System.out.println(javaFile.toString());

	}

	private String generateAccessorName(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

}
