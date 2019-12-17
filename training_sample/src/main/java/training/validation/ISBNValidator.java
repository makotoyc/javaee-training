package training.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ISBNValidator implements ConstraintValidator<ISBN, String>{
	public ISBNValidator() {
	}
	
	@Override
	public void initialize(ISBN constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validateIsbn(value);
	}

	private boolean validateIsbn(String isbn) {
		if (isbn == null) {
			return false;
		}

		isbn = isbn.replaceAll("-", "");

		if (isbn.length() != 13) {
			return false;
		}

		try {
			int total = 0;
			for (int i = 0; i < 12; i++) {
				int digit = Integer.parseInt(isbn.substring(i, i + 1));
				total += (i % 2 == 0) ? digit * 1 : digit * 3;
			}

			int checksum = 10 - (total % 10);
			if (checksum == 10) {
				checksum = 0;
			}

			return checksum == Integer.parseInt(isbn.substring(12));
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
