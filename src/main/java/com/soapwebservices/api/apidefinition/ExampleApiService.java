package com.soapwebservices.api.apidefinition;

import com.soapwebservices.api.domain.InfoDto;
import com.soapwebservices.api.namespace.TestWsNameSpace;
import org.apache.cxf.annotations.WSDLDocumentation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WSDLDocumentation("Service for handling mobile survey requests")
@WebService(targetNamespace = TestWsNameSpace.WSDL_NAMESPACE, serviceName = "exampleApiService")
public interface ExampleApiService {

    @WebMethod(operationName = "getTestInfoDto")
    @WSDLDocumentation("Testowa metoda do api")
    @WebResult(name = "info") // do dokumentacji?
    InfoDto getTestInfoDto(@XmlElement(required = true) @WebParam(name = "current") Integer current);

}
