# service-archetype

Maven archetype project for creating service projects.

Prerequisites
-------------
Download and install the projects
- arp-parent
- arp-utils

Installation
------------
```
mvn install
```

The archetype requires threee properties

| Name  | Description | Default |
| ------------- | ------------- | ------------- |
| service-name | The Name of your service | Service |
| service-prefix | The prefix used to construct the URL of your service | service |
| service-version | The version number of your service | v1 |

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
