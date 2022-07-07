package homework_diexp.vo;

public class Note {
	private String name;
	private Pen pen;
	public Note() {
		// TODO Auto-generated constructor stub
	}
	public Note(String name, Pen pen) {
		super();
		this.name = name;
		this.pen = pen;
	}
	public void write() {
		if(pen!=null) {
			System.out.println(name+"란 노트에 "+pen.getKind()+" 종류의 "+pen.getColor()+"인 펜으로 글을 쓴다.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pen getPen() {
		return pen;
	}
	public void setPen(Pen pen) {
		this.pen = pen;
	}
	

}
