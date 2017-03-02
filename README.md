# service-archetype

Maven archetype project for creating service projects.

Prerequisites
-------------
Apanche Maven must be installed

Download and install the projects
- arp-parent
- arp-utils

Installation
------------
Clone the project service-archetpye via "https://github.com/arpablo/service-archetype.git"
```
git clone https://github.com/arpablo/service-archetype.git
```
Change into the working directory
```
cd service-archetype
```
Install the project
```
mvn install
```

Using the acrhetype
-------------------
The archetype builds a Maven multi-module project with the three modules
- [service-prefix]-api
- [service-prefix]-impl
- [service-prefix]-app

It requires threee properties when used

| Name  | Description | Default |
| ------------- | ------------- | ------------- |
| service-name | The Name of your service | Service |
| service-prefix | The prefix used to construct the URL of your service | service |
| service-version | The version number of your service | v1 |

The parameters "service-name" and "service-version" are used to setup a relative path for accessing the REST-endpoint of the service.

The URL for accessing the service is built as follows:
```
<context-path>/<service-prefix>/api/<service-version>
```

Example
```
http://localhost:8080/service/api/v1
```
whereby "service" is the value of parameter "service-name" and
"v1" ist the value of the parameter "service-version"

The parameter "service-name" is used as a displayable String that names the service. In most cases, it will start with an uppercase-letter, for example "Registry"

Crate new service project
-------------------------

```
mvn archetype:generate 
    -DarchetypeGroupId=de.arp 
    -DarchetypeArtifactId=service-archetype 
    -DarchetypeVersion=1.0.0-SNAPSHOT 
    -DgroupId=<YOUR GROUPID> 
    -DartifactId=<YOUR ARTIFACTID> 
    -Dversion=<YOUR VERSION> 
    -Dpackage=<YOUR PACKAGE> 
    -Dservice-name=<NAME OF YOUR SERVICE> 
    -Dservice-prefix=<PREFIX OF YOUR SERVICE>
    -Sservice-version=<YOUR SERVICE VERSION>
```
