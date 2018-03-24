package com.google.demo.models;

import java.util.List;

public class TrafficSegmentModel {
	
	List<Segments> segmentlist;
	
	public List<Segments> getSegmentlist() {
		return segmentlist;
	}

	public void setSegmentlist(List<Segments> segmentlist) {
		this.segmentlist = segmentlist;
	}

	public static class Segments{
	
		private String segmentid;
		private String street;
		private String _direction;
		private String _fromst;
		private double _length;
		private double start_lon;
		private double _lif_lat;
		private double _lit_lat;
		private double _lit_lon;
		private String _strheading;
		private String _tost;
		private String _traffic;
		private String _last_updt;
		
		public String getSegmentid() {
			return segmentid;
		}
		public void setSegmentid(String segmentid) {
			this.segmentid = segmentid;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String get_direction() {
			return _direction;
		}
		public void set_direction(String _direction) {
			this._direction = _direction;
		}
		public String get_fromst() {
			return _fromst;
		}
		public void set_fromst(String _fromst) {
			this._fromst = _fromst;
		}
		public double get_length() {
			return _length;
		}
		public void set_length(double _length) {
			this._length = _length;
		}
		public double getStart_lon() {
			return start_lon;
		}
		public void setStart_lon(double start_lon) {
			this.start_lon = start_lon;
		}
		public double get_lif_lat() {
			return _lif_lat;
		}
		public void set_lif_lat(double _lif_lat) {
			this._lif_lat = _lif_lat;
		}
		public double get_lit_lat() {
			return _lit_lat;
		}
		public void set_lit_lat(double _lit_lat) {
			this._lit_lat = _lit_lat;
		}
		public double get_lit_lon() {
			return _lit_lon;
		}
		public void set_lit_lon(double _lit_lon) {
			this._lit_lon = _lit_lon;
		}
		public String get_strheading() {
			return _strheading;
		}
		public void set_strheading(String _strheading) {
			this._strheading = _strheading;
		}
		public String get_tost() {
			return _tost;
		}
		public void set_tost(String _tost) {
			this._tost = _tost;
		}
		public String get_traffic() {
			return _traffic;
		}
		public void set_traffic(String _traffic) {
			this._traffic = _traffic;
		}
		public String get_last_updt() {
			return _last_updt;
		}
		public void set_last_updt(String _last_updt) {
			this._last_updt = _last_updt;
		}
		
	}

}
