package pilas;

public class cells {
	private worker wrk;
	private cells nextWrk;
	public worker getWrk() {
		return wrk;
	}
	public void setWrk(worker wrk) {
		this.wrk = wrk;
	}
	public cells getNextWrk() {
		return nextWrk;
	}
	public void setNextWrk(cells nextWrk) {
		this.nextWrk = nextWrk;
	}
}
