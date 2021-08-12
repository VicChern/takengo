package net.takengo.app.entity.location;

import net.takengo.app.entity.base.AbstractEntity;
import net.takengo.app.entity.transport.TransportType;

/**
 * Station where passengers can get off or take specific kind
 * of transport. Multiple stationts compose route of the trip.  
 * @author admin
 *
 */
public class Station extends AbstractEntity {
	private City city;
	
	private Address address;
	
	/**
	 * (Optional) Phone of the inquiry office
	 */
	private String phone;
	
	private Coordinates coordinates;
	
	private TransportType transportType;

	public Station(final City city, TransportType transportType) {
		this.city = city;
		this.transportType = transportType;
	}

	public City getCity() {
		return city;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Coordinates getCoordinate() {
		return coordinates;
	}

	public void setCoordinate(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public TransportType getTransportType() {
		return transportType;
	}

}
