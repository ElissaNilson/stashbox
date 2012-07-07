package org.stashbox.catalogue.model;

public class ItemNumber {
	private long number;
	
	public ItemNumber(long number){
		this.number = number;
	}
	
	public long getLongValue(){
		return number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (number ^ (number >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemNumber other = (ItemNumber) obj;
		if (number != other.number)
			return false;
		return true;
	}

}
