package net.takengo.app.model.entity.location;

import net.takengo.app.model.entity.transport.TransportType;
import net.takengo.app.model.entity.base.AbstractEntity;

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
	
	private Coordinate coordinate;
	
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

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}

	public TransportType getTransportType() {
		return transportType;
	}

}
