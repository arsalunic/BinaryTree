public class PhonePlan {
	private int   minutesAllowed;
	private int   minutesUsed;

	public PhonePlan(int mins) {
		minutesAllowed = mins;
		minutesUsed = 0;
	}

	public int getMinutesAllowed() { return minutesAllowed; }
	public int getMinutesUsed() { return minutesUsed; }
	public void setMinutesAllowed(int x) { minutesAllowed = x; }
	public void setMinutesUsed(int x) { minutesUsed = x; }

	public int getMinutesRemaining() {
		return minutesAllowed - minutesUsed;
	}

	public String toString() {
		return ("(" + minutesAllowed + " minute) Monthly Plan with " +
				getMinutesRemaining() + " minutes remaining");
	}
}