package training.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy= {ISBNValidator.class})
@Target({ElementType.METHOD, 
	  	 ElementType.FIELD, 
	  	 ElementType.ANNOTATION_TYPE, 
	  	 ElementType.CONSTRUCTOR, 
	  	 ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ISBN {
	String message() default "{training.ISBN.message}";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default{};

	@Target({ ElementType.METHOD, 
			  ElementType.FIELD, 
			  ElementType.ANNOTATION_TYPE, 
			  ElementType.CONSTRUCTOR, 
			  ElementType.PARAMETER })
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	public @interface List {
		ISBN[] values();
	}
}
