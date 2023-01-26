package local.test.arc.resource;

import local.test.arc.api.constant.UrlConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import local.test.arc.api.dto.ExampleDto;
import local.test.arc.api.resource.ExampleResource;

import javax.validation.Valid;
import java.util.UUID;

/**
 * ExampleResourceImpl.
 *
 * @author Nikolay_Batov
 */
@RestController
@RequestMapping(UrlConstants.MAIN_URL)
public class ExampleResourceImpl implements ExampleResource {

    @Override
    @GetMapping("/{uuid}")
    public ExampleDto getExampleByID(@PathVariable UUID uuid) {
        return null;
    }

    @Override
    @PostMapping("/create")
    public ExampleDto createExample(@RequestBody @Valid ExampleDto accountDTO) {
        return null;
    }
}
