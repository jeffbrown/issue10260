package demo

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(FooController)
class FooControllerSpec extends Specification {

    void "test something"() {
        when:
        controller.index()

        then:
        response.text == 'Success!'
    }
}
