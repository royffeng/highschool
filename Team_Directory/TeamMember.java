class TeamMember {
	private String fullName;
	private String idString;
	
	public TeamMember(String name, String id) {
		String tempName = "";
		for(int i = 0; i < name.length(); i++) {
			if(i == 0) {
				tempName += (name.charAt(i) + "").toUpperCase();
			}	else if((name.charAt(i) + "").equals(" ") || (name.charAt(i) + "").equals("	")) {
				tempName += name.charAt(i);
				i++;
				tempName += (name.charAt(i) + "").toUpperCase();
			} else {
				tempName += (name.charAt(i) + "").toLowerCase();
			}
		}
		fullName = tempName;
		idString = id;
	}
	
	public String toString() {
		return fullName;
	}
	
	int compareTo(TeamMember other) {
		int check = idString.compareTo(other.idString);
		if(check > 0)
			check = 1;
		else if (check < 0)
			check = -1;
		return check;
	}
}
