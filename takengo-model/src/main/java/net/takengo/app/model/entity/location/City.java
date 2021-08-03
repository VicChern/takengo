package net.takengo.app.model.entity.location;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import net.takengo.app.model.entity.base.AbstractEntity;
import net.takengo.app.model.entity.transport.TransportType;
import net.takengo.app.model.entity.utils.CommonUtils;

/**
 * Any locality that contains transport stations
 * @author admin
 *
 */
public class City extends AbstractEntity {	
	private String name;
	
	/**
	 * Name of the district where city is placed
	 */
	private String district;
	
	/**
	 * Name of the region where district is located.
	 * Region is top-level area in the country
	 */
	private String region;
	
	/**
	 * Set of transport stations that is linked to this 
	 * loyality
	 */
	private Set<Station> stations;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

		public Set<Station> getStations() {
			return CommonUtils.getSafeSet(stations);
		}

	public void setStations(Set<Station> stations) {
		this.stations = stations;
	}

	public void addStation(final Station station) {
		Objects.requireNonNull(station, "station parameter is not initialized");
		if(stations == null) {
			stations = new HashSet<>();
		}
		stations.add(station);
	}



//	/**
//	 * Removes specified station from city station list
//	 * @param station
//	 */
//	public void removeStation(Station station) {
//		Objects.requireNonNull(station, "station parameter is not initialized");
//		if(stations == null) {
//			return;
//		}
//		stations.remove(station);
//	}


	public void removeStation(TransportType transportType, Station station) {
		Objects.requireNonNull(station, "station parameter is not initialized");

		station = new Station(this,transportType);

		if(stations == null) {
			return;
		}
		stations.remove(station);
	}
}
