package br.com.xandecoelho5.template.persist.models;

public abstract class ModelPersist {

	public ModelPersist save() {
		preSave();
		prePersist();
		System.out.printf("Saving %s in database%n", this.getClass().getSimpleName());
		postSave();
		return this;
	}
	
	public ModelPersist update() {
		preUpdate();
		prePersist();
		System.out.printf("Updating %s in database%n", this.getClass().getSimpleName());
		postUpdate();
		return this;
	}
	
	public void delete() {
		preDelete();
		System.out.printf("Removing %s in database%n", this.getClass().getSimpleName());
		postDelete();
	}

	protected abstract void preSave();
	protected  void postSave() {
		// Override this method if you want to add a new behavior
	}
	protected void prePersist() {
		// Override this method if you want to add a new behavior
	}
	protected void preUpdate() {
		// Override this method if you want to add a new behavior
	}
	protected void postUpdate() {
		// Override this method if you want to add a new behavior
	}
	protected void preDelete() {
		// Override this method if you want to add a new behavior
	}
	protected void postDelete() {
		// Override this method if you want to add a new behavior
	}
}
