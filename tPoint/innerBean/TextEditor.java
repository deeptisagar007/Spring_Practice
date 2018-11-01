package com.tPoint.innerBean;

public class TextEditor {
	private SpellChecker spellChecker;

	/**
	 * @return the spellChecker
	 */
	public SpellChecker getSpellChecker() {
		System.out.println("Inside getSpellChecker");
		return spellChecker;
	}

	/**
	 * @param spellChecker
	 *            the spellChecker to set
	 */
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
