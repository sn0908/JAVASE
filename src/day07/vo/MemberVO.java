package day07.vo;

/*
 * [[ VO(Value Object), DTO(Data Transfer Object) ]]
 * 	�� ������Ʈ�μ� ������ �´� ������ ����
 * 	DataBase �� �������� ���
 * 
 * 	ĸ��ȭ(��������) - ��ü�� �Ӽ��� ������ �ϳ��� ����, �ܺηκ��� ���θ� ���� ���� �����Ѵ�.
 * 	
 * 
 * 
 */

// ȸ�� ��ü
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String cell;
	private String email;
	private String address;
	private String birth;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
	
}
