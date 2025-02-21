package net.adoptopenjdk.api

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured
import org.junit.jupiter.api.Test

@QuarkusTest
class ReleaseNamesPathTest : BaseTest() {
    @Test
    fun releaseNames() {

        RestAssured.given()
                .`when`()
                .get("/v3/info/release_names")
                .then()
                .statusCode(200)
    }

    @Test
    fun releaseNamesSortOrder() {

        RestAssured.given()
                .`when`()
                .get("/v3/info/release_names?sort_order=DESC")
                .then()
                .statusCode(200)
    }

    @Test
    fun releaseVersions() {

        RestAssured.given()
                .`when`()
                .get("/v3/info/release_versions")
                .then()
                .statusCode(200)
    }

    @Test
    fun releaseVersionsSortOrder() {

        RestAssured.given()
                .`when`()
                .get("/v3/info/release_versions?sort_order=ASC")
                .then()
                .statusCode(200)
    }
}
