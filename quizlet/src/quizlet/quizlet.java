package quizlet;

public class quizlet {
	private String term;
	private String definition;
	
	
	public quizlet(String t, String d) {
		term = t;
		definition = d;
		
	}


	public String getTerm() {
		return term;
	}


	public void setTerm(String term) {
		this.term = term;
	}


	public String getDefinition() {
		return definition;
	}


	public void setDefinition(String definition) {
		this.definition = definition;
	}
	

}
