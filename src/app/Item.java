package app;

import java.util.Date;

public class Item {

	private Integer id;
	private String description;
	private Integer priority;
	private Date dueDate;
	private String category;

	public Item(String description, Integer priority, Date dueDate, String category) {
		super();
		this.description = description;
		this.priority = priority;
		this.dueDate = dueDate;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", description=" + description + ", priority=" + priority + ", dueDate=" + dueDate
				+ "]";
	}

}
