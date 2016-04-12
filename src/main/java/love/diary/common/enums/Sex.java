package love.diary.common.enums;

public enum Sex {

	MALE("男",0), FEMALE("女",1);
	
	private final String sex;
	
	private int index;
	
	private Sex(String sex,int index){
		this.sex = sex;
		this.index = index;
	}
	
	public static String getName(int index){
		for(Sex s:Sex.values()){
			if(s.getIndex()==index){
				return s.name();
			}
		}
		return null;
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getSex() {
		return sex;
	}
	
	

}
