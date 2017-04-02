package proxy.protectionProxy;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gendar;
	String interests;
	int rating;
	int ratingCount = 0;
	
	/**
	 * 
	* <p>Title: </p>
	* <p>Description: </p>
	* @param name 姓名
	* @param gendar 性别
	* @param interests 兴趣
	* @param rating 得分
	 */
	public PersonBeanImpl(String name, String gendar, String interests, int rating) {
		this.name = name;
		this.gendar = gendar;
		this.interests = interests;
		this.rating = rating;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getGendar() {
		return gendar;
	}

	@Override
	public String getInterests() {
		return interests;
	}

	@Override
	public int getHotOrNotRating() {
		if(ratingCount==0) return 0;
		else return rating/ratingCount;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating+=rating;
		ratingCount++;
	}

}
