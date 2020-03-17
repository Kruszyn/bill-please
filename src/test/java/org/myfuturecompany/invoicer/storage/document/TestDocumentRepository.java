package org.myfuturecompany.invoicer.storage.document;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

class TestDocumentRepository implements DocumentRepository{
    private HashMap<String, Document> fakeRepo = new HashMap<>();

    @Override
    public Document save(Document doc) {
        fakeRepo.put(doc.getDocumentID(), doc);
        return fakeRepo.get(doc.getDocumentID());
    }

    @Override
    public Optional<Document> findByDocumentID(String uuid) {
        return Optional.of(fakeRepo.get(uuid));
    }

    @Override
    public <S extends Document> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Document> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<Document> findAll() {
        return null;
    }

    @Override
    public Iterable<Document> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Document entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Document> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Document> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Document> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Document> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends Document> List<S> insert(Iterable<S> entities) {
        return null;
    }

    @Override
    public <S extends Document> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Document> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Document> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Document> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Document> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Document> boolean exists(Example<S> example) {
        return false;
    }
}
