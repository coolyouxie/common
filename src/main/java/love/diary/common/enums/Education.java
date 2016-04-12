package love.diary.common.enums;

public enum Education {
	
	DEFAULT("未知",-1),
	PRIMARY("小学",0),
	MIDDLE("初中",1),
	HIGH("高中",2),
	COLLEGE("大专",3),
	UNIVERSITY("本科",4),
	GRADUATE("研究生",5),
	DOCTOR("博士",6),
	POST_DOCTORATE("博士后",7);
	
	private final String name;
	
	private int index;
	
	private Education(String name,int index){
		this.name = name;
		this.index = index;
	}
	
	public static String getName(int index){
		for(Education e:Education.values()){
			if(e.index==index){
				return e.getName();
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

	public String getName() {
		return name;
	}
	
	

}
