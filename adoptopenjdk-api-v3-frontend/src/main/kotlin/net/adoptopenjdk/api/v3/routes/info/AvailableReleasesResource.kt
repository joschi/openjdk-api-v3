package net.adoptopenjdk.api.v3.routes.info

import net.adoptopenjdk.api.v3.dataSources.APIDataStore
import net.adoptopenjdk.api.v3.models.ReleaseInfo
import org.eclipse.microprofile.openapi.annotations.Operation
import org.eclipse.microprofile.openapi.annotations.tags.Tag
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Tag(name = "Release Info")
@Path("/v3/info/")
@Produces(MediaType.APPLICATION_JSON)
class AvailableReleasesResource {

    @GET
    @Path("/available_releases/")
    @Operation(summary = "Returns information about available releases")
    fun get(): ReleaseInfo {
        return ReleaseInfo(
            APIDataStore.variants.versions,
            APIDataStore.variants.ltsVersions,
            APIDataStore.variants.latestLtsVersion,
            APIDataStore.variants.latestVersion
        )
    }
}
