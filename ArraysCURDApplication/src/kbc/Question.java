package kbc;

public class Question {
	String questionString; // wht is the capital India
	String option[] = new String[4];
	int correctAnswer; // index number of correct Answer
	String questionInformation;
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String questionString, String[] option, int correctAnswer, String questionInformation) {
		super();
		this.questionString = questionString;
		this.option = option;
		this.correctAnswer = correctAnswer;
		this.questionInformation = questionInformation;
	}
	public String getQuestionString() {
		return questionString;
	}
	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}
	public String[] getOption() {
		return option;
	}
	public void setOption(String[] option) {
		this.option = option;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public String getQuestionInformation() {
		return questionInformation;
	}
	public void setQuestionInformation(String questionInformation) {
		this.questionInformation = questionInformation;
	}
	
	
	
}
