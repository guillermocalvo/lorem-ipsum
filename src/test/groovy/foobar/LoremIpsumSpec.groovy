package foobar

import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Replaces
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class LoremIpsumSpec extends Specification {

    @Bean
    @Replaces(Ipsum)
    Ipsum ipsum = new Ipsum()

    @Inject
    Lorem lorem

    def 'test'() {
        when:
        true
        then:
        true
    }
}
