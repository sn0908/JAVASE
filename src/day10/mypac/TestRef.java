package day10.mypac;

public class TestRef {
	public static void testRef(Sports sports) {
		sports.kind = "�䰡";
		sports.isGroup = false;
	}
	
	public static Sports testRef2(Sports sports) {
		
		return new Sports("�豸", sports.isGroup);
	}
}
