package ch15.lecture.p04sortedSet;

import java.util.TreeSet;

public class C06Comparable {
	public static void main(String[] args) {
		TreeSet<Computer> coms = new TreeSet<>();

		coms.add(new Computer(3, 2));
		coms.add(new Computer(3, 4));
		coms.add(new Computer(7, 2));

		System.out.println(coms);
	}
}

class Computer implements Comparable<Computer> {
	private int cpu;
	private int ram;

	public Computer(int cpu, int ram) {
		super();
		this.cpu = cpu;
		this.ram = ram;
	}

	public int getCpu() {
		return cpu;
	}

	public int getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpu;
		result = prime * result + ram;
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
		Computer other = (Computer) obj;
		if (cpu != other.cpu)
			return false;
		if (ram != other.ram)
			return false;
		return true;
	}

	@Override
	public int compareTo(Computer o) {
		int cpuDiff = this.cpu - o.cpu;
		if (cpuDiff == 0) {
			return this.ram - o.ram;
		}

		return cpuDiff;
	}

}
