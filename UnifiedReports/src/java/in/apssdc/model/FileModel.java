package in.apssdc.model;

import com.andromeda.commons.model.BaseModel;

public class FileModel extends BaseModel {
	private static final long serialVersionUID = 1L;
	private String fileName;
	private String base64String;
	private String name;
	private String id;
	private String folderName;

	public String getFolderName() {
		return this.folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getBase64String() {
		return this.base64String;
	}

	public void setBase64String(String base64String) {
		this.base64String = base64String;
	}
}
