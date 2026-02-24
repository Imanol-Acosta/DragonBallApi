package edu.ucne.dragonballapi.domain.repository

import edu.ucne.dragonballapi.data.remote.Resource
import edu.ucne.dragonballapi.data.remote.dto.PlanetDto

interface PlanetRepository {
    suspend fun getPlanets(
        page: Int,
        limit: Int,
        name: String?,
        isDestroyed: Boolean?
    ): Resource<List<PlanetDto>>

    suspend fun getPlanetDetail(id: Int): Resource<PlanetDto>
}
