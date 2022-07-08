package com.Cab_Invoice_Generator;

public class CabInvoiceGenerator {

	private final int costPerKm = 10;
	private final int costPerMinute = 1;
	public int minFare = 5;
	double totalFare;

	public double CalculateFare(double DISTANCE, int TIME) {

		totalFare = costPerKm * DISTANCE + costPerMinute * TIME;
		if (totalFare < minFare)
			totalFare = minFare;
		return totalFare;
	}

	public double calculateFare(Rides[] rides) {
		double totalFare = 0.0;
		for (Rides ride : rides)
			totalFare = totalFare + this.CalculateFare(ride.distance, ride.time);
		return totalFare;
	}
}
