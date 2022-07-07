package a01_diexp.z06_vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("file01")
public class FileLoad {
	private String title;
	
	// 공통 설정 내용을 특정할 필드에 바로 할당되게 처리
	@Value("${file.upload}")
	private String repository;
	public FileLoad() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRepository() {
		return repository;
	}
	public void setRepository(String repository) {
		this.repository = repository;
	}
	public FileLoad(String title, String repository) {
		super();
		this.title = title;
		this.repository = repository;
	}
	

}
