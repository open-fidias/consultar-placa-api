#!/usr/bin/env bash

set -o nounset
set -o errexit
set -o pipefail

npx swagger-cli bundle -o openapi.json swagger-consultar-placa.yaml
