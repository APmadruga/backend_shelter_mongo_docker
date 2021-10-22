package com.pet.manager.repository;
import com.pet.manager.model.Author;
import com.pet.manager.model.Feed;
import com.pet.manager.model.Pet;
import com.pet.manager.model.PetType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends MongoRepository<Pet, String> {
    Optional<Pet> findPetByFirstName(String firstName);
    List<Pet> findPetByPetType(PetType petType);
    @Query("{'pet.feedKG': ?0}")
    List<Feed> findByFeedKG(final String feedKG);
}
