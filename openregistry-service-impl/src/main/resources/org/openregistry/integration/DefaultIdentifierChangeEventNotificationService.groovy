package org.openregistry.integration

import groovy.xml.StreamingMarkupBuilder
import java.text.SimpleDateFormat

/**
 * Groovy-based implementation of <code>IdentifierChangeEventNotificationService</code>
 *
 * @author Dmitriy Kopylenko
 * @since 1.0
 */
public class DefaultIdentifierChangeEventNotificationService implements IdentifierChangeEventNotificationService {

  //The setters are auto-generated by Groovy, so the correct types will be injected by Spring 
  def integrationGateway

  def identifierChangeEventDestinationUri

  def df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")

  public void createAndSendEventMessageFor(String internalIdentifierType,
                                           String internalIdentifierValue,
                                           String changedIdentifierType,
                                           String changedIdentifierValue) {

    this.integrationGateway.dispatch(
            this.identifierChangeEventDestinationUri,
            buildEventXmlMessage(internalIdentifierType,
                    internalIdentifierValue,
                    changedIdentifierType,
                    changedIdentifierValue))
  }

  private def buildEventXmlMessage(internalIdType, internalId, changedIdType, changedId) {
    def xml = new StreamingMarkupBuilder()
    xml.encoding = 'UTF-8'
    xml.bind {
      mkp.xmlDeclaration()
      "open-registry-person-identifier-change-event"(timestamp: df.format(new Date())) {
        identifier() {
          internal(type: internalIdType, value: internalId)
          changed(type: changedIdType, value: changedId)
        }
      }
    }.toString()
  }
}