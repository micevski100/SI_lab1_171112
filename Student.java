class Student {
	private String index;
	private String firstName;
	private String lastName;
	private List<Integer> labPoints;

	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> labPoints){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	// TODO setters & getters

	// GETTERS
	public String getIndex()
	{ return this.index; }

	public String getFirstName()
	{ return this.firstName; }

	public String getLastName()
	{ return this.lastName; }

	// SETTERS
	public void setIndex(String index)
	{ this.index = index; }

	public void setFirstName(string firstName)
	{ this.firstName = firstName; }

	public void setLastName(String lastName)
	{ this.lastName = lastName; }


	public double getAverage() {
		//TODO
		return (float) labPoints
				.stream()
				.mapToInt(x -> x)
				.sum() / labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		return labPoints.size() >= 8;
	}
}
