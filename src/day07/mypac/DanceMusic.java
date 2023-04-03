package day07.mypac;

public class DanceMusic implements Music, Singer {

	private String genre;
	private String name;
	private String composer;
	private String writer;
	private String groupName;
	
	public DanceMusic() {
		this.genre = "dance";
		this.name = "캔디";
		this.composer = "홍길동";
		this.writer = "홍길동";
		this.groupName = "NCT DREAM";
	}
	
	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getGroupName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setGroupName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setGenre(String genre) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setComposer(String composer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getComposer() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setWriter(String writer) {
		// TODO Auto-generated method stub
		
	}
	@Override	// 어노테이션 - 부가정보 또는 추가기능 제공. 명시적으로도 사용 가독성 up!
	public String getWriter() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void listen() {
		
		
	}
	
	
	
	 
}
