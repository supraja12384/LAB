package interfaces;

public interface resizable {
	void resizewidth(int width);
	void resizeheight(int height);
	public static void main(String[]args) {
		square r=new square(100,150);
		r.printsize();
		r.resizeheight(100);
		r.resizewidth(150);
	}

}
class square implements resizable{
	private int width;
	private int height;
	public square(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public void resizewidth(int width) {
		this.width=width;
	}
	public void resizeheight(int height){
		this.height=height;
	}
	public void printsize() {
		System.out.println("width:"+width+",height:"+height);
	}
	
}
