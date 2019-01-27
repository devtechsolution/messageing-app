# messageing-app
# Internationalization

## Configuration
`
 - LocalResolver
    1. Default Locale - Locale.US
 - ResourceBundleMessageSource
  
`
## Usages
`
- Autowired MessageSource
- @RequestHeader(value="Accept--language", required=false) Locale locale
- messageSurce.getMessage("helloworld.message", null, locale)

`
