package Automation.Spotify;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Api {
	public String token = " Bearer BQCDLTZ9S0Ou8ARuYBtNFKSZL1hiz_5sv4zVdntC_Bmj80ZTas2CaqqGJWzFqpZClGT0JffyhrUYTZAycKbPmUajIJRZmHgWY0NZTJxSvLPzZ94deVFzUFN6CRqkRs3r4OcXzXWBjTYWhIQISqQHFo7J7BE_RTCMw5m_RuHStVc0kwN5A6F7b-EDIvlVYtUrR9rwg9X3jBIyPo1Y6eYtOiiDqgoDl1h5stoqf7-gChnK44-4SSHiIRoIrPjzJ2vK0EwYzGM-0qk";
	@Test
	
	public void getUserProfile() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization", token)
				.when()
				.get("https://api.spotify.com/v1/users/316ln6ivj6226lmh43vody2sx3bi");
				response.prettyPrint();
				System.out.println(response.path("external_urls.spotify"));
				
	}
	@Test
	public void createUserProfile() {
		Response response = given()
				.header("Accept", "application/json")
				.header("Content-Type", "application/json")
				.header("Authorization", token)
				.when()
				.post("https://api.spotify.com/v1/users/");
				response.prettyPrint();
	}
				
				
 //Track
	@Test
	
   public void getTrack() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/tracks/11dFghVXANMlKmJXsNCbNl?market=ES");
		response.prettyPrint();
	}
	
	@Test
	 public void getSeveralTracks() {
			Response response = given()
			.header("Accept", "application/json")
			.header("Content-Type", "application/json")
			.header("Authorization", token)
			.when()
			.get("https://api.spotify.com/v1/tracks?market=ES&ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
			response.prettyPrint();
	 }
	@Test
	
	public void getTrackAudioFeatures() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/audio-features/11dFghVXANMlKmJXsNCbNl");
		response.prettyPrint();
}
	@Test
	
	public void getTrackAudioAnalysis() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/audio-analysis/11dFghVXANMlKmJXsNCbNl");
		response.prettyPrint();
	}
	
    //Shows
	
	@Test
	
	public void getSeveralShows() {
	Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/shows?market=ES&ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
		response.prettyPrint();
	}
	
	//Personalization
	
	@Test
	public void getUserTopItems() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/shows?market=ES&ids=5CfCWKI5pZ28U0uOzXkDHe%2C5as3aKmN2k11yfDDDSrvaZ");
		response.prettyPrint();
	}
	
	//Markets
	
	@Test
	public void getAvailableMarkets() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/markets");
		response.prettyPrint();
	}
	
	//Albums
	
	@Test
	
	public void getSeveralAlbums() {
	Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/albums");
		response.prettyPrint();
	}
	@Test
	
	public void getlAlbums() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy?market=ES");
		response.prettyPrint();
	}
	
	@Test
	public void getlAlbumsTrack() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks?market=ES&limit=10&offset=5");
		response.prettyPrint();
	}
	
	//Chapters
	@Test
	public void getlSeveralChapters() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/chapters?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B&market=ES");
		response.prettyPrint();
	}
	@Test
	public void getChapters() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/chapters/38bS44xjbVVZ3No3ByF1dJ?market=ES");
		response.prettyPrint();
	}
	
	//Artists
	
	@Test
	public void getArtistsAlbums() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/albums?include_groups=single%2Cappears_on&market=ES&limit=10&offset=5");
		response.prettyPrint();
	}
	
	@Test
	public void getArtistsRelatedArtists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/related-artists");
		response.prettyPrint();
	}
	
	@Test
	public void getArtistsTopTracks() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/top-tracks?market=ES");
		response.prettyPrint();
	}
	
	@Test
	public void getArtists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
		response.prettyPrint();
	}
	@Test
	public void getSeveralArtists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/artists?ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
		response.prettyPrint();
	}
	
	@Test
	public void getSeveralAudiobooks() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/audiobooks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B&market=ES");
		response.prettyPrint();
	}
	
	//Browse
	@Test
	public void getAvailableGenreSeeds() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/recommendations/available-genre-seeds");
		response.prettyPrint();
	}
	@Test
	public void getSeveralBrowseCategories() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/browse/categories?country=SE&locale=sv_SE&limit=10&offset=5");
		response.prettyPrint();
	}
	@Test
	public void Recommendatons() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.pathParam("seed_artists","country")
		.pathParam("seed_genres","classical")
		.when()
		.get("https://api.spotify.com/v1/recommendations?seed_artists={seed_artists}&seed_genres={seed_genres}");
		response.prettyPrint();
	}
	
	@Test
	public void NewRealeases() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/browse/new-releases?country=SE&limit=10&offset=5");
		response.prettyPrint();
	}
	@Test
	public void FeaturedPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/browse/featured-playlists?country=SE&locale=sv_SE&timestamp=2014-10-23T09%3A00%3A00.000Z&limit=10&offset=5");
		response.prettyPrint();
	}
	
	//Search
	@Test
	public void SearchForItem() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.pathParam("q","artist")
		.pathParam("type","track")
		.when()
		.get("https://api.spotify.com/v1/search?q={q}&type={type}");
		response.prettyPrint();
	}
	
	//Follow
	@Test
	public void FollowedArtists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/me/following?type=artist&after=0I2XqVXqHScXjHhk6AYYRe&limit=10");
		response.prettyPrint();
	}
	@Test
	public void FollowedArtistsorUsers() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
		response.prettyPrint();
	}
	@Test
	public void UsersFollowPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers/contains?ids=jmperezperez%2Cthelinmichael%2Cwizzler");
		response.prettyPrint();
	}
	@Test
	public void CreatelPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.body("{\"name\":\"New Playlist\",\"description\":\"New playlist description\",\"public\":false}")
		.when()
		.post("https://api.spotify.com/v1/users/316ln6ivj6226lmh43vody2sx3bi/playlists");
		response.prettyPrint();
	}
	@Test

	public void addItemsTolPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.post("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks?uris=spotify%3Atrack%3A4iV5W9uYEdYUVa79Axb7Rh%2Cspotify%3Atrack%3A1301WleyT98MSxVHPZCA6M");
		response.prettyPrint();
	}
	
	@Test
	public void UserPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.post("https://api.spotify.com/v1/users/316ln6ivj6226lmh43vody2sx3bi/playlists");
		response.prettyPrint();
	}
	
	@Test
	public void Playlists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.queryParam("playlist id","3cEYpjA9oz9GiPac4AsH4n")
		.queryParam("market","ES")
		.when()
		.post("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n?market=ES&fields=items(added_by.id%2Ctrack(name%2Chref%2Calbum(name%2Chref");
		response.prettyPrint();
	}
	
	@Test
	public void PlaylistsItems() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.queryParam("playlist id","3cEYpjA9oz9GiPac4AsH4n")
		.queryParam("market","ES")
		.when()
		.post("https://api.spotify.com/v1/playlists//tracks");
		response.prettyPrint();
	}
	
	@Test
	public void PlaylistsCoverImage() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.post("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/images");
		response.prettyPrint();
	}
	
	@Test
	public void getCurrentUserPlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.when()
		.post("https://api.spotify.com/v1/me/playlists?limit=10&offset=5");
		response.prettyPrint();
	}
	
	@Test
	public void changePlaylists() {
		Response response = given()
		.header("Accept", "application/json")
		.header("Content-Type", "application/json")
		.header("Authorization", token)
		.body("{\"name\":\"Updated Playlist Name\",\"description\":\"Updated playlist description\",\"public\":false}")
		.when()
		.put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n");
		response.prettyPrint();
	}
}
	

	
	


	
	

	
				

